package com.dyonovan.tcnodetracker.events;

import com.dyonovan.tcnodetracker.lib.NodeList;
import cpw.mods.fml.common.eventhandler.Event;

public class NodeNotificationEvent extends Event {

    public static class NodeListUpdated extends NodeNotificationEvent {

        private final NodeList nodeList;

        public NodeListUpdated(NodeList nodeList) {
            this.nodeList = nodeList;
        }

        public NodeList getNodeList() {
            return nodeList;
        }
    }
}
