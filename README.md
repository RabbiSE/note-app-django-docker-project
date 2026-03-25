# Steps:

## Clone the repo:
```
git clone https://github.com/RabbiSE/note-app-django-docker-project.git
```

## Build the app image using Dockerfile:
```
docker build -t django-app .
```

## Run the containers using docker compose:
```
docker compose up
```

## Build the app image and run the containers in one go:
```
docker compose up --build
```
