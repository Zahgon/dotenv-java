package io.github.cdimascio.dotenv;

import io.github.cdimascio.dotenv.internal.DotenvParser;
import io.github.cdimascio.dotenv.internal.DotenvReader;
import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * Builds and loads and {@link Dotenv} instance.
 * @see Dotenv#configure()
 */
public class DotenvBuilder {

    private String filename = ".env";

    private String directoryPath = "./";

    private boolean systemProperties = false;

    private boolean throwIfMissing = true;

    private boolean throwIfMalformed = true;

    /**
     * Sets the directory containing the .env file.
     * @param path the directory containing the .env file
     * @return this {@link DotenvBuilder}
     */
    public DotenvBuilder directory(final String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the name of the .env file. The default is .env.
     * @param name the filename
     * @return this {@link DotenvBuilder}
     */
    public DotenvBuilder filename(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Does not throw an exception when .env is missing.
     * @return this {@link DotenvBuilder}
     */
    public DotenvBuilder ignoreIfMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Does not throw an exception when .env is malformed.
     * @return this {@link DotenvBuilder}
     */
    public DotenvBuilder ignoreIfMalformed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets each environment variable as system properties.
     * @return this {@link DotenvBuilder}
     */
    public DotenvBuilder systemProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Load the contents of .env into the virtual environment.
     * @return a new {@link Dotenv} instance
     * @throws DotenvException when an error occurs
     */
    public Dotenv load() throws DotenvException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static class DotenvImpl implements Dotenv {

        private final Map<String, String> envVars;

        private final Set<DotenvEntry> set;

        private final Set<DotenvEntry> setInFile;

        public DotenvImpl(final List<DotenvEntry> envVars) {
            final Map<String, String> envVarsInFile = envVars.stream().collect(toMap(DotenvEntry::getKey, DotenvEntry::getValue, (a, b) -> b));
            this.envVars = new HashMap<>(envVarsInFile);
            this.envVars.putAll(System.getenv());
            this.set = this.envVars.entrySet().stream().map(it -> new DotenvEntry(it.getKey(), it.getValue())).collect(collectingAndThen(toSet(), Collections::unmodifiableSet));
            this.setInFile = envVarsInFile.entrySet().stream().map(it -> new DotenvEntry(it.getKey(), it.getValue())).collect(collectingAndThen(toSet(), Collections::unmodifiableSet));
        }

        @Override
        public Set<DotenvEntry> entries() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Set<DotenvEntry> entries(final Dotenv.Filter filter) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String get(final String key) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String get(String key, String defaultValue) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
