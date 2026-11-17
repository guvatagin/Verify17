# ЛР1. Работа на GitHub

Команда клонирует репозиторий, работает в ветке, описывает приложение и тестирует приложение другой команды методом black-box.

## Команды

```bash
git clone https://github.com/LvovAP/Chukotka.git
cd Chukotka
git switch -c student/<фамилия>
git add .
git commit -m "LR1: add specification"
git push -u origin student/<фамилия>
```

## Материалы

- `specification.md` — функциональная спецификация;
- `use-case.puml` — use-case диаграмма;
- `black-box-cases.md` — тест-кейсы и найденные дефекты.
