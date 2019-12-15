import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<Integer, String> cards = new LinkedHashMap<Integer, String>();
        ArrayList<Integer> cardsId = new ArrayList<Integer>();
        int id = 1;
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String num : nums) {
            for (String color : colors) {
                String card = color + num;
                cards.put(id,card);
                cardsId.add(id);
                id++;

            }
        }
        cards.put(id,"大S");
        cardsId.add(id);
        cards.put(++id,"小S");
        cardsId.add(id);
        System.out.println(cards);

        Collections.shuffle(cardsId);
        System.out.println(cardsId);

        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        ArrayList<Integer> p3 = new ArrayList<Integer>();
        ArrayList<Integer> dp = new ArrayList<Integer>();

        for (int i = 0; i < cardsId.size(); i++) {
            int card = cardsId.get(i);

            if (i >= 51) {
                dp.add(card);
                continue;
            }

            if (i % 3 == 0) {
                p1.add(card);
            } else if (i % 3 == 1) {
                p2.add(card);
            } else {
                p3.add(card);
            }

        }

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dp);

        lookCards(p1,cards);
        lookCards(p2,cards);
        lookCards(p3,cards);
        lookCards(dp,cards);



    }

    private static void lookCards(ArrayList<Integer> p,Map<Integer,String> map) {
        for (int card:p) {
            String cardString = map.get(card);
            System.out.print(cardString + " ");
        }
        System.out.println();
    }
}
