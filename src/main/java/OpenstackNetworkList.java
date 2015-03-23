import org.jclouds.ContextBuilder;
import org.jclouds.openstack.neutron.v2.NeutronApi;
import org.jclouds.openstack.neutron.v2.NeutronApiMetadata;


public class OpenstackNetworkList {

    public static void main(String[] args) {

        NeutronApi neutronApi = ContextBuilder.newBuilder(new NeutronApiMetadata())
                .credentials("TENANT:USERNAME", "PASSWORD")
                .endpoint("YOUR_ENDPOINT_URL")
                .buildApi(NeutronApi.class);

        System.out.println(neutronApi.getNetworkApi("REGION").list());

    }
}
