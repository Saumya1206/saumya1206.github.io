import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarmGUI {
    private JFrame frame;
    private JButton irrigateButton;
    private JLabel statusLabel;
    private Farm farm;

    public FarmGUI() {
        farm = new Farm(100, 30);
        frame = new JFrame("Farm Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        statusLabel = new JLabel();
        statusLabel.setBounds(50, 50, 200, 30);
        frame.add(statusLabel);

        irrigateButton = new JButton("Irrigate");
        irrigateButton.setBounds(50, 100, 200, 30);
        frame.add(irrigateButton);

        irrigateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                farm.irrigate();
                updateStatus();
            }
        });

        updateStatus();
        frame.setVisible(true);
    }

    private void updateStatus() {
        statusLabel.setText("Water: " + farm.getWaterSupply() + ", Need: " + farm.getCropNeed());
    }

    public static void main(String[] args) {
        new FarmGUI();
    }
}

class Farm {
    private int waterSupply;
    private int cropNeed;

    public Farm(int waterSupply, int cropNeed) {
        this.waterSupply = waterSupply;
        this.cropNeed = cropNeed;
    }

    public void irrigate() {
        if (waterSupply >= cropNeed) {
            System.out.println("Irrigating crops...");
            waterSupply -= cropNeed;
        } else {
            System.out.println("Not enough water to irrigate crops.");
        }
    }

    public int getWaterSupply() {
        return waterSupply;
    }

    public int getCropNeed() {
        return cropNeed;
    }
}

