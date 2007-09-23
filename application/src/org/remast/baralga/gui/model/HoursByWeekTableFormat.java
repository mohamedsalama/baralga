package org.remast.baralga.gui.model;

import org.remast.baralga.Messages;
import org.remast.baralga.gui.utils.Constants;
import org.remast.baralga.model.report.HoursByWeek;

import ca.odell.glazedlists.gui.TableFormat;

/**
 * @author Jan Stamer
 */
public class HoursByWeekTableFormat implements TableFormat<HoursByWeek> {

    public int getColumnCount() {
        return 2;
    }

    public String getColumnName(int column) {
        switch (column) {
        case 0:
            return Messages.getString("HoursByWeekTableFormat.WeekHeading"); //$NON-NLS-1$
        case 1:
            return Messages.getString("HoursByWeekTableFormat.HoursHeading"); //$NON-NLS-1$
        default:
            return null;
        }
    }

    public Object getColumnValue(HoursByWeek baseObject, int column) {
        switch (column) {
        case 0:
            return baseObject.getWeek();
        case 1:
            return Constants.durationFormat.format(baseObject.getHours());
        default:
            return null;
        }
    }

}