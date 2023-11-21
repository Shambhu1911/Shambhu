//slip 5 Q1

class Continent {
    String continentName;

    // Parameterized constructor for Continent
    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void displayContinent() {
        System.out.println("Continent: " + continentName);
    }
}

class Country extends Continent {
    String countryName;

    // Parameterized constructor for Country
    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public void displayCountry() {
        System.out.println("Country: " + countryName);
    }
}

class State extends Country {
    String stateName;

    // Parameterized constructor for State
    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public void displayState() {
        System.out.println("State: " + stateName);
    }
}

public class main6 {
    public static void main(String[] args) {
        // Creating an object of State
        State myState = new State("Asia", "India", "Maharashtra");

        // Displaying place hierarchy
        myState.displayState();
        myState.displayCountry();
        myState.displayContinent();
    }
}
