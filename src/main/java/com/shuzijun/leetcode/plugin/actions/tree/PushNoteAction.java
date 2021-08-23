package com.shuzijun.leetcode.plugin.actions.tree;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.shuzijun.leetcode.plugin.manager.NoteManager;
import com.shuzijun.leetcode.plugin.model.Config;
import com.shuzijun.leetcode.plugin.model.Question;

import javax.swing.*;

/**
 * @author shuzijun
 */
public class PushNoteAction extends  AbstractTreeAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent, Config config, JTree tree, Question question) {
        NoteManager.push(question,anActionEvent.getProject());
    }
}