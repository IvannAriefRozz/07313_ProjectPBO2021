package Controller;
import Entity.RecordEntity;
/**
 *
 * @author asus
 */
public interface ClusterControllerInterface {
    public void initiateClusterAndCentroid(int clusterNumber);
    public void initializeCluster(int clusterNumber,RecordEntity record);
    public void FinalCluster();
    public String ViewDataCluster();
    
}
