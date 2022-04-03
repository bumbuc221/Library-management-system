package p4;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * <h1>LimitaCaractere</h1>
 * <p>Clasa pentru setarea limitei caracterelor</p>
 * @version 4.08
 * @author Bumbuc Ivan
 */
public class LimitaCaractere extends PlainDocument {
    private int limit;

    /**
     * Constructor cu paramentrii
     * @param limit limita de cifre pt text
     */
    LimitaCaractere(int limit) {
        super();
        this.limit = limit;
    }

    /**
     * Contructor cu doi parametrii
     * @param limit
     * @param upper
     */
    LimitaCaractere(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    /**
     * Metoda pentru inserarea stringului si verificare
     * @param offset
     * @param str
     * @param attr
     * @throws BadLocationException
     */
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}