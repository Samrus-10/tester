package sam.rus.gof.creational.abstractFactory;

public interface TeamFactory {
    Developer getDeveloper();

    Tester getTester();

    TeamLead getTeamLead();
}
