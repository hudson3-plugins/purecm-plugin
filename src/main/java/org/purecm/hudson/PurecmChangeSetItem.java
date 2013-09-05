package org.purecm.hudson;

public class PurecmChangeSetItem {

    private String path;
    private Integer revision;
    private PurecmChangeSetItemType type = PurecmChangeSetItemType.pcmItemNone;
    private String renamePath;

    public PurecmChangeSetItem() {
    }

    public String getNewPath() {
        if (renamePath.length() > 0) {
            return renamePath;
        }
        else {
            return path;
        }
    }

    public void setPath(String value) {
        path = value;
    }

    public void setRevision(Integer value) {
        revision = value;
    }

    public void setChangeType(String value) {

        if ( value.equalsIgnoreCase("add") ) {
            type = PurecmChangeSetItemType.pcmItemAdd;
        }
        else if ( value.equalsIgnoreCase("edit") ) {
            type = PurecmChangeSetItemType.pcmItemEdit;
        }
        else if ( value.equalsIgnoreCase("delete") ) {
            type = PurecmChangeSetItemType.pcmItemDelete;
        }
        else if ( value.equalsIgnoreCase("add folder") ) {
            type = PurecmChangeSetItemType.pcmItemAddFolder;
        }
        else if ( value.equalsIgnoreCase("delete folder") ) {
            type = PurecmChangeSetItemType.pcmItemDeleteFolder;
        }
        else {
            type = PurecmChangeSetItemType.pcmItemNone;
        }
    }

    public void setRenamePath(String value) {
        renamePath = value;
    }
};