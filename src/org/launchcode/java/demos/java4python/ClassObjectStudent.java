package org.launchcode.java.demos.java4python;

/**
 * Created by johnmilito on 3/18/17.
 */
public class ClassObjectStudent {

    public class Student {

        private static int nextStudentId = 1;
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public Student(String name, int studentId,
                       int numberOfCredits, double gpa) {
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }

        public Student(String name, int studentId) {
            this(name, studentId, 0, 0);
        }

        public Student(String name) {
            this(name, nextStudentId);
            nextStudentId++;
        }

        public void addGrade(int courseCredits, double grade) {
            // Update the appropriate fields: numberOfCredits, gpa
            this.gpa = ((this.gpa * this.numberOfCredits) + grade) / (this.numberOfCredits + courseCredits);
            this.numberOfCredits += courseCredits;

        }

        public String getGradeLevel() {
            // Determine the grade level of the student based on numberOfCredits
            private String gradeLevel = "gradeLevel";

            if (this.numberOfCredits < 30) {
                gradeLevel = "Freshman";
            } else if (this.numberOfCredits < 60) {
                gradeLevel = "Sophomore";
            } else if (this.numberOfCredits < 90) {
                gradeLevel = "Junior";
            } else {
                gradeLevel = "Senior";
            }

            return gradeLevel;
        }

    /* getters and setters omitted */

    }
}
