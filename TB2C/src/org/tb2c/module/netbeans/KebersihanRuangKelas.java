/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "tb2c",
        id = "org.tb2c.module.netbeans.KebersihanRuangKelas"
)
@ActionRegistration(
        displayName = "#CTL_KebersihanRuangKelas"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_KebersihanRuangKelas=tb2c")
public final class KebersihanRuangKelas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
