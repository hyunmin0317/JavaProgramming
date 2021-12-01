package exercises.week14.example02;

import javax.swing.*;

public interface Model extends Observable {
    DefaultListModel getDefaultListModel();
    void addImage(String fileName);
    Image getSelectedImage();
    void selectImage(int idx);
}