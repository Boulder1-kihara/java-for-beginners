# 📘 Day 7: Java Graphical User Interfaces (GUI) with Swing & AWT

Welcome to Day 7! Today, we transition from command-line applications into visual, interactive desktop applications using **Java Swing** and the **Abstract Window Toolkit (AWT)**.

---

## 🎨 What is Java Swing?

**Swing** is a GUI library that is part of the **Java Foundation Classes (JFC)**. It extends and enhances the older **Abstract Window Toolkit (AWT)** by offering:
- Approximately **4x more UI components** than AWT.
- **Lightweight components** that are written 100% in pure Java (not mapped 1-to-1 to native operating system widgets).
- **Platform independence**: Your application looks and behaves consistently across Windows, macOS, and Linux.
- **Pluggable Look and Feel (PL&F)**: Change visual themes dynamically without restarting the application!
- **MVC (Model-View-Controller)** architecture.

---

## ⚖️ Java AWT vs. Java Swing

| Feature | Java AWT | Java Swing |
| :--- | :--- | :--- |
| **Package** | `java.awt.*` | `javax.swing.*` (and uses `java.awt` for layouts/events) |
| **Component Weight** | Heavyweight (relies on native OS peers) | Lightweight (pure Java, drawn on top of canvas) |
| **Portability** | Platform-dependent appearance | Platform-independent & consistent |
| **Performance** | Higher memory consumption, OS bugs | Highly optimized, faster execution |
| **Extensibility** | Basic rectangular buttons and labels | Custom borders, icons in buttons, round controls |

---

## 🏛️ Swing Class Hierarchy

```
                      Object
                        │
                    Component
                        │
                    Container
          ┌─────────────┴─────────────┐
          ▼                           ▼
        Window                    JComponent
          │             ┌─────────────┼─────────────┐
        Frame           ▼             ▼             ▼
          │          AbstractButton JLabel       JList, JTable,
        JFrame          │                        JComboBox, etc.
                  ┌─────┴─────┐
                  ▼           ▼
               JButton    JToggleButton
                              │
                         JCheckBox / JRadioButton
```

---

## 🧩 The MVC (Model-View-Controller) Connection

A visual component consists of three distinct aspects:
1. **Model**: Stores the state information and raw data.
2. **View**: Determines how the component is rendered on screen.
3. **Controller**: Listens and reacts to user actions (clicks, keypresses, drags).

---

## 📚 Swing Component Cheat Sheet

| Class | Description |
| :--- | :--- |
| **`Component`** | Abstract base class for non-menu graphical controls. |
| **`Container`** | Component that can hold other components (e.g., panels, frames). |
| **`JComponent`** | Base class for all Swing visual UI components. |
| **`JLabel`** | Display non-editable text or images. |
| **`JButton`** | Push button triggering actions when clicked. |
| **`JTextField`** | Single-line editable text input. |
| **`JPasswordField`**| Masked single-line text input for passwords. |
| **`JTextArea`** | Multi-line text input/display area. |
| **`JCheckBox`** | Toggle button for true/false selection. |
| **`JRadioButton`** | Mutually exclusive option button (grouped with `ButtonGroup`). |
| **`JComboBox`** | Dropdown menu allowing selection from a list. |
| **`JList`** | Scrollable list of selectable items. |
| **`JProgressBar`** | Visual progress bar displaying percentage towards completion. |
| **`JSlider`** | Draggable knob within a bounded range. |
| **`JSpinner`** | Single-line input letting users select a number from a sequence. |
| **`JOptionPane`** | Standard dialog popups (alerts, input prompts, confirmations). |
| **`JFileChooser`** | File picker dialog for opening and saving files. |
| **`JColorChooser`**| Color selection palette dialog. |

---

## 🗂️ Day 7 Source Code Files

| File | Description |
| :--- | :--- |
| [`SwingFirstApp.java`](./src/SwingFirstApp.java) | Example 1 from notes: `JFrame` with an interactive `JButton` ("GFG WebSite Click"). |
| [`AwtButtonDemo.java`](./src/AwtButtonDemo.java) | Example 2 from notes: Classic AWT `Frame` with OK, SUBMIT, and CANCEL buttons. |
| [`AwtCheckboxDemo.java`](./src/AwtCheckboxDemo.java) | Example 3 from notes: Language selection checkboxes (Hindi, English, Marathi). |
| [`SwingComponentsShowcase.java`](./src/SwingComponentsShowcase.java) | An interactive modern GUI showcase combining `JTextField`, `JCheckBox`, `JSlider`, `JProgressBar`, and dialogs. |

---

## 💻 How to Compile and Run

```bash
cd day07-swing-gui/src

# Compile all GUI classes:
javac *.java

# Launch the modern showcase window:
java SwingComponentsShowcase
```
