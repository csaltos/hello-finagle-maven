package playground;

import com.twitter.finagle.ListeningServer;
import com.twitter.finagle.Thrift;
import com.twitter.util.Await;
import com.twitter.util.Future;
import com.twitter.util.TimeoutException;

import playground.HelloService;

public final class HelloThriftServer {

  private HelloThriftServer() { }

  public static class HelloImpl implements HelloService.FutureIface {
    public Future<String> hi(String name) {
      return Future.value("hi " + name);
    }
  }

  public static void main(String[] args) throws TimeoutException, InterruptedException {
    HelloService.FutureIface impl = new HelloImpl();
    ListeningServer server = Thrift.server().serveIface("localhost:9097", impl);
    Await.ready(server);
  }
}