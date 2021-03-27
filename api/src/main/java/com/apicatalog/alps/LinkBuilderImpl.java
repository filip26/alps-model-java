package com.apicatalog.alps;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import com.apicatalog.alps.dom.element.Link;

final class LinkBuilderImpl implements LinkBuilder {

    private final LinkImpl link;

    public LinkBuilderImpl() {
        link = new LinkImpl();
    }

    @Override
    public Link build() {
        return link;
    }

    @Override
    public LinkBuilder href(URI href) {
        this.link.href = href;
        return this;
    }

    @Override
    public LinkBuilder rel(String rel) {
        this.link.rel = rel;
        return this;
    }

    @Override
    public LinkBuilder tag(List<String> tag) {
        this.link.tag = tag;
        return this;
    }

    static final class LinkImpl implements Link {

        URI href;
        String rel;

        List<String> tag;

        @Override
        public URI href() {
            return href;
        }

        @Override
        public String rel() {
            return rel;
        }

        @Override
        public List<String> tag() {
            return tag != null ? tag : Collections.emptyList();
        }
    }
}
