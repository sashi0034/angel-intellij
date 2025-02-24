package com.github.sashi0034.angelintellij;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ValidationStartupActivity implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
//        System.out.println("AngelScript IntelliJ Plugin has been activated");
//
//        Messages.showInfoMessage("AngelScript IntelliJ Plugin has been activated", "AngelScript IntelliJ Plugin");

//        ToastNotifier.show(
//                "AngelScript IntelliJ Plugin",
//                "AngelScript IntelliJ Plugin has been activated",
//                NotificationType.INFORMATION);

        // Check for the existence of Node.js when the project starts
        NodeChecker.checkNodeInstallation();
    }
}

class NodeChecker {
    public static void checkNodeInstallation() {
        try {
            // Execute "node -v" to get the Node.js version
            ProcessBuilder pb = new ProcessBuilder("node", "-v");
            Process process = pb.start();
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                showNodeNotInstalled();
            }
        } catch (IOException | InterruptedException e) {
            showNodeNotInstalled();
        }
    }

    private static void showNodeNotInstalled() {
        ToastNotifier.show(
                "Node.js Not Installed",
                "<a href='https://nodejs.org/en/download'>https://nodejs.org/en/download</a> \nNode.js is not installed.\nTo use the plugin's features in AngelScript Language Server, you need to install Node.js.",
                NotificationType.ERROR
        );
    }
}

class ToastNotifier {
    public static void show(String title, String content, NotificationType type) {
        // Get the current project (null is acceptable if a project is not required)
        Project project = ProjectManager.getInstance().getDefaultProject();

        // Create a notification
        Notification notification = new Notification(
                "angel-intellij", // Notification group ID
                title,
                content,
                type
        );

        // Display the notification
        Notifications.Bus.notify(notification, project);
    }
}
