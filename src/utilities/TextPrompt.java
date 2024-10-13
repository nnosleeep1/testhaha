/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;

public class TextPrompt extends JLabel implements FocusListener, DocumentListener {
    private JTextComponent component;
    private Document document;

    public enum Show {
        ALWAYS,
        FOCUS_GAINED,
        FOCUS_LOST;
    }

    private Show show;
    private boolean showPromptOnce;
    private int focusLost;

    public TextPrompt(String text, JTextComponent component) {
        this(text, component, Show.ALWAYS);
    }

    public TextPrompt(String text, JTextComponent component, Show show) {
        this.component = component;
        setShow(show);
        document = component.getDocument();

        setText(text);
        setFont(component.getFont());
        setForeground(Color.gray);
        setBorder(BorderFactory.createEmptyBorder(component.getInsets().top, component.getInsets().left, component.getInsets().bottom, component.getInsets().right));
        setHorizontalAlignment(SwingConstants.LEADING);

        component.addFocusListener(this);
        document.addDocumentListener(this);

        component.setLayout(new BorderLayout());
        component.add(this);
        checkForPrompt();
    }

    public void changeAlpha(float alpha) {
        changeAlpha((int)(alpha * 255));
    }

    public void changeAlpha(int alpha) {
        alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;
        Color foreground = getForeground();
        Color withAlpha = new Color(foreground.getRed(), foreground.getGreen(), foreground.getBlue(), alpha);
        super.setForeground(withAlpha);
    }

    public void changeStyle(int style) {
        setFont(getFont().deriveFont(style));
    }

    private void checkForPrompt() {
        if (document.getLength() > 0) {
            setVisible(false);
        } else {
            setVisible(true);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        checkForPrompt();
    }

    @Override
    public void focusLost(FocusEvent e) {
        checkForPrompt();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setShowPromptOnce(boolean showPromptOnce) {
        this.showPromptOnce = showPromptOnce;
    }
}
