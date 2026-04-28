package com.logisticRouterTracker;

public class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.getCheckpointId().equals(checkpointId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }

        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.getCheckpointId().equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.getDistanceFromLast();
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public void printRoute() {
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            T cp = current.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.println(index + ". " + cp.getType() + " - " + cp.getLocationName() + " - " + status + " - Penalty: " + cp.calculatePenalty());
            current = current.next;
            index++;
        }
    }

    public boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> current = head;
        while (current != null) {
            if (current.data.getType().equals("DeliveryCheckpoint")) {
                hasDelivery = true;
            } else if (current.data.getType().equals("FuelCheckpoint")) {
                hasFuel = true;
            }
            current = current.next;
        }

        return hasDelivery && hasFuel;
    }
}
