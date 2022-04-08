package dat.startcode.model.entities;

import java.util.HashMap;

public class Products {
    private String Smag;
    private int Pris;
    public Products(String Smag, int Pris) {
        this.Smag = Smag;
        this.Pris = Pris;
    }

    public String getSmag() {
        return Smag;
    }

    public int getPris() {
        return Pris;
    }
}
