package glasgow.jake.spellbook.util.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author jake degiovanni
 */

public class Spell extends RealmObject {
    private int spell_level;
    @PrimaryKey  private String spell_name;
    private String spell_school;
    private String casting_time;
    private String range;
    private String components;
    private String duration;
    private String description;

    public int getSpell_level() {
        return spell_level;
    }

    public void setSpell_level(int spell_level) {
        this.spell_level = spell_level;
    }

    public String getSpell_name() {
        return spell_name;
    }

    public void setSpell_name(String spell_name) {
        this.spell_name = spell_name;
    }

    public String getSpell_school() {
        return spell_school;
    }

    public void setSpell_school(String spell_school) {
        this.spell_school = spell_school;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public void setCasting_time(String casting_time) {
        this.casting_time = casting_time;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
