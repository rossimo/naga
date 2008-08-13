package naga;

import java.io.IOException;

/**
 * Class with null-implementations for all callbacks.
 * 
 * @author Christoffer Lerno
 * @version $Revision$ $Date$   $Author$
 */
public class ServerSocketObserverAdapter implements ServerSocketObserver
{

	public void acceptFailed(IOException exception)
	{
	}

	public void serverSocketDied(Exception e)
	{
	}

	public void newConnection(NIOSocket nioSocket)
	{
	}
}