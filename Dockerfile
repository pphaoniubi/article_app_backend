# Use an official Node.js runtime as a parent image
FROM node:18-alpine

# Set the working directory in the container
WORKDIR /app

# Install pnpm globally and clean npm cache to reduce image size
RUN npm install -g pnpm && npm cache clean --force

# Copy package.json and pnpm-lock.yaml (if available)
COPY package.json pnpm-lock.yaml ./

# Install dependencies
RUN pnpm install

# Copy the rest of the application code
COPY . .

# Build the application
RUN pnpm run build

# Expose the port the app runs on (default for Cloud Run is 8080)
EXPOSE 8080

# Define the command to run the application
CMD ["pnpm", "run", "preview", "--host", "0.0.0.0", "--port", "8080"]