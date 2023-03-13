package chapter5.java;

public class Application {

    // 프로퍼티
    private final UserPreferences preferences;

    public Application(UserPreferences preferences) {
        this.preferences = preferences;
    }

    // 설정이 필요한 뷰에 프로퍼티를 전달
    public void showWelcome() {
        new WelcomeView(preferences).show();
    }

    public void editPreferences() {
        new PreferencesView(preferences).show();
    }

}
