package me.danielgm.vaadin.numberpanel.client;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

// ServerRpc is used to pass events from client to server
public interface NumberPanelServerRpc extends ServerRpc {

    // Example API: Widget click is clicked
    public void clicked(MouseEventDetails mouseDetails);

}