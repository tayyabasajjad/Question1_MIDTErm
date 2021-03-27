/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingjtable;

import java.util.ArrayList;
import swingjtable.model.JTableModel;
import swingjtable.model.Student;

public class StudentTableModel extends JTableModel {

    String[] columnNames;
    private Object[][] data;

    public void setColumnNames(String[] col) {
        columnNames = new String[col.length];
        for (int j = 0; j < col.length; j++) {
            columnNames[j] = col[j];
        }
        this.setColumnName(columnNames);
    }

    public void setTableData(ArrayList list) {
        data = new Object[list.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i < list.size(); i++) {

            Student objData = (Student) list.get(i);

            data[row][0] = objData.getStudentRollNum();
            data[row][1] = objData.getStudentName();
            data[row][2] = objData.getProgram();

            row++;
        }
        this.setData(data);
    }

    public void populateTable() {
        String[] col = {"Student Roll #", "Student Name", "Program"};
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("001", "Asad", "MCS"));
        studentList.add(new Student("002", "Waseem", "MCS"));
        studentList.add(new Student("003", "Arsalan", "MCS"));
        studentList.add(new Student("004", "Sidra", "MCS"));
        studentList.add(new Student("005", "Mehvish", "MCS"));
        
        setColumnNames(col);
        setTableData(studentList);
    }
}
