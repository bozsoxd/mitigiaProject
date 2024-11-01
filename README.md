# Build project
1. mitigia-task mappában ```mvn clean package``` parancs kiadása a .jar file létrehozásához
2. Gyökérkönyvtárban Dockerfile buildelése: ```docker build --tag=mitigia-task:latest .```

# Deploy project
- docker-compose file futtatása: ```docker compose up```