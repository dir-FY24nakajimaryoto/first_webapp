package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppScopeLogListener
 *
 */
@WebListener
public class AppScopeLogListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public AppScopeLogListener() {
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    // データが追加されたとき
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
        System.out.println("アプリケーションスコープに登録しました:" + scae.getName() + "=" + scae.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    // データが削除されたとき
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    // データが変更されたとき
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    }
	
}
