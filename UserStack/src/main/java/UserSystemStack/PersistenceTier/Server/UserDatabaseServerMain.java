package UserSystemStack.PersistenceTier.Server;

import UserSystemStack.PersistenceTier.Application.DAOs.UserDao;
import io.grpc.Server;

import java.io.IOException;

public class UserDatabaseServerMain {

        public static void main(String[] args) {
            Server server = io.grpc.ServerBuilder
                    .forPort(4444)
                    .addService(new UserDatabaseServer(new UserDao()))
                    .build();

            try {
                server.start();
                server.awaitTermination();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
