/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Link;

import javax.swing.JPanel;

/**
 *
 * @author Ven
 */
public class Link_Panel 
{
    public static void CallPanel(JPanel pnl1,JPanel pnl2,Object obj)
    {
        pnl1.removeAll();
        pnl1.add(pnl2);
        pnl1.revalidate();
        pnl1.repaint();
        obj=pnl2;
    }
}
