public abstract class Command {
    public abstract void exec() throws Exception;
    public abstract void unexec() throws Exception;
}
