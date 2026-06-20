# Invoice Manager

A Java Swing desktop application for tracking invoices, built for the Object-Oriented Programming exam at UniMoRe (Bachelor's in Computer Science).

Lets you add, edit, delete, filter, and search invoices in a table view, then save your data or export it to Excel, CSV, or plain text.

## Features

- Add, edit, and delete invoices (description, amount, date)
- Filter and search invoices by date range and text
- Sortable table view
- Save and load data in a custom binary format
- Export to Excel (via Apache POI), CSV, or plain text
- Custom date picker component
- Styled with FlatLaf for a modern look

## Project structure

```
src/
  Main.java              entry point
  Frames/                main application window and settings menu
  Panels/                date filter panel
  Listeners/              UI event handlers (add, edit, delete, sort, totals)
  Filters/                table filtering logic
  TableModel/             Invoice data model and table model
  SaveLoadExport/         binary save/load, CSV/text/Excel export
  DatePickerGUI/          custom date picker component
resources/
  TaskBarIcon.png         application icon
```

## Running it

Requires three libraries on the classpath, none of which are included in this repo:

- [FlatLaf](https://www.formdev.com/flatlaf/) `3.1.1` — UI theming
- [LGoodDatePicker](https://github.com/LGoodDatePicker/LGoodDatePicker) `11.2.1` — date picker component
- [Apache POI](https://poi.apache.org/download.html) `poi-bin-5.2.3` — Excel export
- [log4j-core](https://logging.apache.org/log4j/2.x/download.html) `2.20.0` — required by Apache POI

Download these and place them in a `lib/` folder at the project root (the two single jars directly in `lib/`, and the full `poi-bin-5.2.3` folder inside `lib/` as well), then:

```bash
chmod +x run.sh
./run.sh
```

`run.sh` compiles `src/` and runs `Main`, with everything in `lib/` on the classpath.

## Built with

- Java, Swing
- [FlatLaf](https://www.formdev.com/flatlaf/) for UI theming
- [LGoodDatePicker](https://github.com/LGoodDatePicker/LGoodDatePicker) for date selection
- [Apache POI](https://poi.apache.org/) for Excel export
