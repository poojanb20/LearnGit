static void viewStudents() {
        if (count == 0) {
            System.out.println("⚠ No student records found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
