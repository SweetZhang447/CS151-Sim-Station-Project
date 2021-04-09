package SimStation;

import mvc.Command;
import mvc.Model;

public class ResumeCommand extends Command {

    public ResumeCommand(Model model) {
        super(model);
    }

    public void execute() throws Exception {
        SimStation station = (SimStation) model;
        station.Resume();
    }


}
