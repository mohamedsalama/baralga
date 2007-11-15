package org.remast.baralga.gui.utils;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 * @author remast
 */
public interface Constants {

    //------------------------------------------------
    // Date Formats
    //------------------------------------------------
    
    public static final SimpleDateFormat hhMMFormat = new SimpleDateFormat("HH:mm"); //$NON-NLS-1$
    
    //------------------------------------------------
    // Number Formats
    //------------------------------------------------

    public static final NumberFormat durationFormat = new DecimalFormat("#0.00"); //$NON-NLS-1$
    
    //------------------------------------------------
    // Colors
    //------------------------------------------------

    public static final Color BEIGE = new Color(245, 245, 220);
    
    public static final Color VERY_LIGHT_GREY = new Color(240, 240, 240);
    
    public static final Color DARK_BLUE = new Color(64, 64, 128);

}
