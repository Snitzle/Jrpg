import java.util.ArrayList;
import java.util.Arrays;

public class Battle {

    ArrayList<Actor> Actors = new ArrayList<>();

    public Battle( Actor...entity) {
        Actors.addAll(Arrays.asList(entity));
    }

    public int getActorsAmount() {
        return Actors.size();
    }



}
