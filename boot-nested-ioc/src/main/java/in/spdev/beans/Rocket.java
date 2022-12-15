package in.spdev.beans;

public class Rocket {

    Launcher launcher;

    public void setLauncher(Launcher launcher) {
        this.launcher = launcher;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "launcher=" + launcher +
                '}';
    }
}
