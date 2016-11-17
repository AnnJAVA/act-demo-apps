package demo.helloworld;

import act.Version;
import act.boot.app.RunApp;
import org.osgl.mvc.annotation.GetAction;

/**
 * The simple hello world app.
 * <p>Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!</p>
 */
@SuppressWarnings("unused")
public class HelloWorldApp {

    @GetAction
    public void home() {
    }

    public static void main(String[] args) throws Exception {
        RunApp.start("Hello World", Version.appVersion(), HelloWorldApp.class);
    }

}
