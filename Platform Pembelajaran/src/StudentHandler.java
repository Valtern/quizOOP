public class StudentHandler {
    Node head, tail;
    Course crs = new Course();

    StudentHandler() {
        head = tail = null;
    }

    public boolean isEmpty () {
        return head == null;
    }
    public void addFirst (Student data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
            tail = head;
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Student data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node newNode = new Node(head, data, null);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add (Student data, int index) throws Exception {
        if(isEmpty()) {
            addFirst(data);
        } else if (index < 0) {
            throw new Exception("Index out of bound");
        } else {
            Node current = head;
            int i =0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node newNode = new Node(current, data, null);
                current.next = newNode;
                tail = newNode;
            } else if (current.prev == null){
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void clear() {
        head = null;
    }

    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list is still empty");
        } else if (head.next == null) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void remove(int index) throws Exception{
        if(isEmpty()) {
            throw new Exception("Index value is out of bound");
        } else if (head.next == null) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current = current.prev;
                current.next = null;
                tail = current;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public Student getFirst () throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return head.data;
    }
    public Student getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return tail.data;
    }

    public Student get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return  tmp.data;
    }


    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM: "+ tmp.data.getNim() + " \nName: " + tmp.data.getName() + "\nAge: "+ tmp.data.getAge() +  "\nAddress: " + tmp.data.getAddress() + "\nEmail: " + tmp.data.getEmail() + "\nPhone number: " + tmp.data.getPhoneNumber() + "\nID: " + tmp.data.getPersonId() + "\nNIM: " + tmp.data.getNim() + "\nCurrent education: "+ tmp.data.getCurrentEducation() + "\nCurrent Course: " + tmp.data.getCurrentCourse() + "Current taken course: " + crs.getTitle());
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public int SeqSearch (int nim) {
        Node tmp = head;
        int index = 0;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if (tmp.data.getNim() == nim) {
                System.out.println("Found students at index-"+ index + " with the data of \n" + tmp.data.getNim()+ " \n" + tmp.data.getName() + " \n");
                return tmp.data.getNim();
            } else {
                System.out.println("Student not found !");
            }
        }
        return -1;
    }

    public void sortData () {
        if (head == null || head.next == null){
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data.getNim() < current.next.data.getNim()) {
                    Student temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void menu() {
        System.out.println("Welcome to the student management system. What would you like to do ?");
        System.out.println("1. Add students from first");
        System.out.println("2. Add students from last");
        System.out.println("3. Add students in specific index");
        System.out.println("4. Remove students from first");
        System.out.println("5. Remove students from last");
        System.out.println("6. Remove students in specific index");
        System.out.println("7. Print");
        System.out.println("8. Search by NIM");
        System.out.println("9. Sort by NIM - DESC");
        System.out.println("10. Exit");
    }
}
