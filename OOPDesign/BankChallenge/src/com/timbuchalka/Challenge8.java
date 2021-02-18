package com.timbuchalka;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Challenge8 {

    public static void main(String[] args) {
            final Tutor tutor = new Tutor();
            final Student student = new Student(tutor);
            tutor.setStudent(student);

            Thread tutorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    tutor.studyTime();
                }
            });

            Thread studentThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    student.handInAssignment();
                }
            });

            tutorThread.start();
            studentThread.start();
        }
    }

    class Tutor {
        private Lock lock;
        private Student student;

        public synchronized void setStudent(Student student) {
            this.student = student;
            lock = new ReentrantLock(true);
        }

        public void studyTime() {
            System.out.println("Tutor has arrived");
            if(lock.tryLock()){
                try {
                    // wait for student to arrive and hand in assignment
                    Thread.sleep(300);
                    student.startStudy();
                    System.out.println("Tutor is studying with student");
                }  catch (InterruptedException e) {

                }  finally {
                    lock.unlock();
                }
            }
        }

        public  void getProgressReport() {
            // get progress report
            System.out.println("Tutor gave progress report");
        }
    }


    class Student {

        private Tutor tutor;

        Student(Tutor tutor) {
            this.tutor = tutor;
        }

        public void startStudy() {
            // study
            System.out.println("Student is studying");
        }

        public void handInAssignment() {
            tutor.getProgressReport();
            System.out.println("Student handed in assignment");
        }
    }

