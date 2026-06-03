package club.doki7.duelx.core.command;


public sealed interface Command {
    String commandName();
    int actionCount();

    non-sealed interface Action extends Command {}
    non-sealed interface Reaction extends Command {}
}
