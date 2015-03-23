import org.jclouds.ContextBuilder;
import org.jclouds.openstack.neutron.v2.NeutronApi;
import org.jclouds.openstack.neutron.v2.NeutronApiMetadata;


public class OpenstackNetworkList {

    public static void main(String[] args) {

        NeutronApi neutronApi = ContextBuilder.newBuilder(new NeutronApiMetadata())
                .credentials("desktop:zomb-prj-293", "LSkfs123FSmg")
                .endpoint("http://identity.haze.yandex-team.ru/v2.0")
                .buildApi(NeutronApi.class);

        System.out.println(neutronApi.getNetworkApi("sas").list());

    }
}
