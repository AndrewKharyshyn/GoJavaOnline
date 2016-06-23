package Module6;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.sound.midi.Instrument;
import java.rmi.NoSuchObjectException;
import java.util.*;

/**
 * Created by Andrew on 23.06.2016.
 */
public class MusicShop {
    Map<String, Integer> stock;

    public void setStock(Map<String, Integer> stock) {
        this.stock = stock;
    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IncorrectQuantityException {
        List<MusicInstrument> clientOrder = new ArrayList<MusicInstrument>();

        for (String instumentName : order.keySet()) {

            if (order.get(instumentName) <= 0){
                throw new IncorrectQuantityException();
            }
            if (stock.containsKey(instumentName) && stock.get(instumentName) >= order.get(instumentName)) {

                stock.put(instumentName, stock.get(instumentName) - order.get(instumentName));
                Class InstrumentClass = Class.forName("Module6." + instumentName);
                InstrumentClass.newInstance();

                for (int i = 0; i < order.get(instumentName); i++) {
                    clientOrder.add((MusicInstrument) InstrumentClass.newInstance());
                }

            } else {
               throw new NoSuchElementException (instumentName);
                                   }
            }
            return clientOrder;
        }
    }