package chapter3;

import java.util.Objects;

public class EmailAddressJava {

    // 1. 값은 불변이다. 따라서 필드를 final로 선언한다.
    private final String localPart;
    private final String domain;

    // 2. 문자열을 파싱해 EmailAddress를 만드는 parse라는 정적 팩터리 메서드가 있다. 이 메서드는 주 생성자를 호출한다.
    public static EmailAddressJava parse(String value) {
        int atIndex = value.lastIndexOf('@');
        if (atIndex < 1 || atIndex == value.length() - 1) {
            throw new IllegalArgumentException(
                    "chapter3.EmailAddress must be two parts separated by @"
            );
        }
        return new EmailAddressJava(
                value.substring(0, atIndex),
                value.substring(atIndex + 1)
        );
    }

    // 3. 필드는 생성자에서 초기화된다.
    public EmailAddressJava(String localPart, String domain) {
        this.localPart = localPart;
        this.domain = domain;
    }

    // 4. 클래스의 프로퍼티를 구성하는 접근자 메서드는 자바빈의 명명 규칙을 따른다.
    public String getLocalPart() {
        return localPart;
    }

    // 4. 클래스의 프로퍼티를 구성하는 접근자 메서드는 자바빈의 명명 규칙을 따른다.
    public String getDomain() {
        return domain;
    }

    // 5. 이 클래스는 equals와 hashCode 메서드를 구현해서 모든 필드가 같을 때 두 chapter3.EmailAddress 값이 같다고 판정되도록 보장한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddressJava that = (EmailAddressJava) o;

        return localPart.equals(that.localPart) && domain.equals(that.domain);
    }

    // 5. 이 클래스는 equals와 hashCode 메서드를 구현해서 모든 필드가 같을 때 두 chapter3.EmailAddress 값이 같다고 판정되도록 보장한다.
    @Override
    public int hashCode() {
        return Objects.hash(localPart, domain);
    }

    // 6. toString은 표준 전자 우편 주소 형식을 돌려준다.
    @Override
    public String toString() {
        return localPart + "@" + domain;
    }

}
