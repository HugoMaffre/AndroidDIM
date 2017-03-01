package hugo.maffre.mytodolistproject;

import java.util.ArrayList;

/**
 * Created by hmaffre on 01/03/2017.
 */
public final class StockageValeurs {


    private static volatile StockageValeurs instance = null;

    public ArrayList<String> values = new ArrayList<String>();

    /**
     * Constructeur de l'objet.
     */
    private StockageValeurs() {

        super();
    }

    /**
     * Méthode permettant de renvoyer une instance de la classe Singleton
     * @return Retourne l'instance du singleton.
     */
    public final static StockageValeurs getInstance() {

        if (StockageValeurs.instance == null) {

            synchronized(StockageValeurs.class) {
                if (StockageValeurs.instance == null) {
                    StockageValeurs.instance = new StockageValeurs();
                }
            }
        }
        return StockageValeurs.instance;
    }




}
