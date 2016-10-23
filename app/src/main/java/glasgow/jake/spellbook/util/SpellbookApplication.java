package glasgow.jake.spellbook.util;

import android.app.Application;

import io.realm.Realm;

/**
 * @author jake degiovanni
 */

public class SpellbookApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
