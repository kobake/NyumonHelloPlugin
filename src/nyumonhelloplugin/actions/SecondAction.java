package nyumonhelloplugin.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class SecondAction implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow m_window;

	@Override
	public void run(IAction action) {
		boolean answer = MessageDialog.openQuestion(m_window.getShell(), "質問ダイアログ", "どうしましょう？");
		if(answer){
			MessageDialog.openInformation(m_window.getShell(), "はいはい", "はいはいはい");
		}
		else{
			MessageDialog.openInformation(m_window.getShell(), "いいえいいえ", "いいえいいえいいえ");
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		m_window = window;
	}

}
