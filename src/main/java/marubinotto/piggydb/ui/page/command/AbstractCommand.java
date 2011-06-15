package marubinotto.piggydb.ui.page.command;

import marubinotto.piggydb.ui.page.ModelFactory;

import org.apache.commons.lang.UnhandledException;

public abstract class AbstractCommand extends ModelFactory {

	@Override 
	public String getPath() {
		return null;
	}

	@Override 
	public void onRender() {
		super.onRender();
		
		disableClientCaching();
		try {
			execute();
		}
		catch (Exception e) {
			throw new UnhandledException(e);
		}
	}
	
	protected abstract void execute() throws Exception;
}