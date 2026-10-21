import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class pW extends DefaultTreeModel {
   public pW(TreeNode var1) {
      super(var1);
   }

   @Override
   public int getChildCount(Object var1) {
      return ((TreeNode)var1).getChildCount();
   }
}





