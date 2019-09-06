import javax.swing.*;

public class PosterFactory {
    public static void main(String[] args) {

        int postersBought;
        int boxesFilled;
        int postersRemaining;
        final int BOX_LIMIT = 11;
        String postersBoughtString;

        postersBoughtString = JOptionPane.showInputDialog(null, "How many posters were ordered today?",
                "Order Dialog", JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought/BOX_LIMIT;
        postersRemaining = postersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " +
        boxesFilled + " with " + postersRemaining + " poster(s) leftover.");

    }
}
