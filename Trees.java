package com.mycompany.trees;
import java.util.Scanner;

public class Trees {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // Eleman ekleme işlemi (insert)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        // Eğer ağaç boşsa, yeni bir düğüm ekler
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Değer küçükse sola, büyükse sağa gider
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Aynı değeri eklememek için kontrol
        return root;
    }

    // Eleman arama işlemi (search)
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        // Ağacın köküne ulaşılmış veya değer bulunmuşsa
        if (root == null) {
            return false;
        }

        // Değer bulunduysa
        if (root.value == value) {
            return true;
        }

        // Değer küçüklük veya büyüklük durumuna göre devam edilir
        if (value < root.value) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    // Maksimum değer bulma (max)
    public int findMax() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    // Minimum değer bulma (min)
    public int findMin() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    // Eleman silme işlemi (delete)
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        // Değer küçükse sola, büyükse sağa gider
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Değer bulundu, silme işlemi başlatılır

            // Düğümün tek bir alt dalı varsa
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Düğümün her iki alt dalı varsa, en küçük değeri sağ alt daldan alır
            root.value = minValue(root.right);

            // Sağ alt dalda en küçük değeri siler
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Ağacı yazdırma işlemi (inorder traversal)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Trees bst = new Trees();
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan işlemi seçmesini ister
        while (true) {
            System.out.println("1. Eleman ekle");
            System.out.println("2. Eleman ara");
            System.out.println("3. Maksimum değeri bul");
            System.out.println("4. Minimum değeri bul");
            System.out.println("5. Eleman sil");
            System.out.println("6. Ağacı yazdır");
            System.out.println("7. Çıkış");
            System.out.print("Bir seçenek girin: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Eleman ekle
                    System.out.print("Eklenecek değeri girin: ");
                    int value = scanner.nextInt();
                    bst.insert(value);
                    break;
                case 2: // Eleman ara
                    System.out.print("Aranacak değeri girin: ");
                    value = scanner.nextInt();
                    if (bst.search(value)) {
                        System.out.println("Değer bulundu.");
                    } else {
                        System.out.println("Değer bulunamadı.");
                    }
                    break;
                case 3: // Maksimum değer bul
                    System.out.println("Maksimum değer: " + bst.findMax());
                    break;
                case 4: // Minimum değer bul
                    System.out.println("Minimum değer: " + bst.findMin());
                    break;
                case 5: // Eleman sil
                    System.out.print("Silinecek değeri girin: ");
                    value = scanner.nextInt();
                    bst.delete(value);
                    break;
                case 6: // Ağacı yazdır
                    System.out.println("Ağaç sıralı şekilde: ");
                    bst.inorder();
                    break;
                case 7: // Çıkış
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek.");
            }
        }}}
